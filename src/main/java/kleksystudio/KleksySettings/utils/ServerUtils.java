package kleksystudio.KleksySettings.utils;

import java.io.*;
import java.net.*;
import java.util.*;
import org.bukkit.*;
import com.google.gson.*;
import org.bukkit.entity.*;

public class ServerUtils {

    public static String s(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static UUID getOnlineUUID(Player p) throws MalformedURLException, IOException, IllegalStateException {
        UUID onlineUUID = null;
        URLConnection connection = (new URL("https://api.mojang.com/users/profiles/minecraft/" + p.getName())).openConnection();
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = bufferedReader.readLine()) != null)
                    response.append(inputLine);
                    onlineUUID = UUID.fromString((new JsonParser()).parse(response.toString()).getAsJsonObject().get("id")
                            .getAsString().replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5"));
                    bufferedReader.close();
                } catch (Throwable throwable) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable throwable1) {
                        throwable.addSuppressed(throwable1);
                    }
                    throw throwable;
                }
                if (inputStream != null)
                    inputStream.close();
            } catch (Throwable throwable) {
                if (inputStream != null)
                    try {
                        inputStream.close();
                    } catch (Throwable throwable1) {
                        throwable.addSuppressed(throwable1);
                    }
                throw throwable;
            }
        return onlineUUID;
    }
}

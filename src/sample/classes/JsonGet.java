package sample.classes;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Class JsonGet
 */
public class JsonGet  extends  Thread{
    /**
     * Data from json
     */
    public String jsonIn;
    /**
     * URL of json
     */
    public static String url;

    /**
     * Read info form json
     * @param rd object Reader
     * @return data from json
     * @throws IOException
     */
    private String readAll(final Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public void ConnectAndGetData() {
        jsonIn = "";
        InputStream is;
        try {
            is = new URL(url).openStream();
            try {
                BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                try {
                    jsonIn = readAll(rd);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        ConnectAndGetData();
        super.run();
    }
}

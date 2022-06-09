package api;

import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
import io.restassured.response.Response;
import utils.LogUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ApiUtils extends LogUtils {

    protected static Response response;
    protected static JsonObject body;
    protected static String url;
    protected static Map<String, String> headers = new HashMap<>();
    protected static Map<String, String> params = new HashMap<>();
    protected static String token;

    public void log(String verbo) {

        super.logInfo(" ******** Dados enviados no request ********");
        super.logInfo(verbo + " " + url);
        super.logInfo("Body : \n" + body);
        super.logInfo("Headers : " + headers);
        super.logInfo("Params : " + params);

        super.logInfo(" ******** Dados Recebidos ********");
        super.logInfo("Status code: " + response.statusCode());
        super.logInfo("Payload recebido: \n" + response.asPrettyString());
        super.logInfo("Tempo de resposta: " + response.timeIn(TimeUnit.MILLISECONDS));

    }

}
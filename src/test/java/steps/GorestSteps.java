package steps;

import api.ApiUtils;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import utils.PropertiesUtils;

import java.util.Properties;

public class GorestSteps extends ApiUtils {

    PropertiesUtils prop = new PropertiesUtils();

    @Dado("que possuo gorest token valido")
    public void que_possuo_gorest_token_valido() {

        token = (prop.getProp("token_gorest"));
    }
    @Quando("envio um request de cadastro de usuario com dados validos")
    public void envio_um_request_de_cadastro_de_usuario_com_dados_validos() {


    }
    @Entao("o usuario deve ser criado corretamente")
    public void o_usuario_deve_ser_criado_corretamente() {

    }
    @Entao("o status code do request deve ser {int}")
    public void o_status_code_do_request_deve_ser(Integer int1) {

    }

}

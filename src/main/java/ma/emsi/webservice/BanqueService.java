package ma.emsi.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@WebService(serviceName = "BanqueWS")
public class BanqueService {



    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name="montant")double mt){
        return mt*3.14;
    }

    @WebMethod(operationName = "code")
    public Compte getCompte(@WebParam(name="code")Integer code){
        return new Compte(code, Math.random()*9000, new Date());
    }


    @WebMethod
    public List<Compte> listeComptes(){
        List<Compte> compteList = new ArrayList<>();
        compteList.add(new Compte(1, Math.random()*9000, new Date()));
        compteList.add(new Compte(2, Math.random()*9000, new Date()));
        compteList.add(new Compte(3, Math.random()*9000, new Date()));

        return compteList;
    }
}

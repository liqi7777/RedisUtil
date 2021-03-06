
package com.example.webservice.hangzhouplatlease.company.service.impl;

import com.example.webservice.hangzhouplatlease.core.dao.xsd.SuperDao;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RentQyServicePortType", targetNamespace = "http://impl.service.company.hzfc.com")
@XmlSeeAlso({
    com.example.webservice.hangzhouplatlease.company.service.impl.ObjectFactory.class,
    com.example.webservice.hangzhouplatlease.core.dao.xsd.ObjectFactory.class
})
public interface RentQyServicePortType {


    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveZlry")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveZlry", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveZlry")
    @ResponseWrapper(localName = "saveZlryResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveZlryResponse")
    public String saveZlry(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param keywords
     * @param token
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:checkZlry")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "checkZlry", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.CheckZlry")
    @ResponseWrapper(localName = "checkZlryResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.CheckZlryResponse")
    public String checkZlry(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "keywords", targetNamespace = "http://impl.service.company.hzfc.com")
                    String keywords)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:getFwStationlist")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "getFwStationlist", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.GetFwStationlist")
    @ResponseWrapper(localName = "getFwStationlistResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.GetFwStationlistResponse")
    public String getFwStationlist(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token);

    /**
     * 
     * @param dsrlist
     * @param token
     * @param info
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveHtEncrypt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveHtEncrypt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtEncrypt")
    @ResponseWrapper(localName = "saveHtEncryptResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtEncryptResponse")
    public String saveHtEncrypt(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "info", targetNamespace = "http://impl.service.company.hzfc.com")
                    String info,
            @WebParam(name = "dsrlist", targetNamespace = "http://impl.service.company.hzfc.com")
                    String dsrlist)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns com.hzfc.core.dao.xsd.SuperDao
     */
    @WebMethod(action = "urn:getSuperDao")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "getSuperDao", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.GetSuperDao")
    @ResponseWrapper(localName = "getSuperDaoResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.GetSuperDaoResponse")
    public SuperDao getSuperDao();

    /**
     * 
     * @param str
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:getSavePath")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "getSavePath", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.GetSavePath")
    @ResponseWrapper(localName = "getSavePathResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.GetSavePathResponse")
    public String getSavePath(
            @WebParam(name = "str", targetNamespace = "http://impl.service.company.hzfc.com")
                    String str);

    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveFw")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveFw", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFw")
    @ResponseWrapper(localName = "saveFwResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFwResponse")
    public String saveFw(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param xqmc
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:getLkbMessage")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "getLkbMessage", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.GetLkbMessage")
    @ResponseWrapper(localName = "getLkbMessageResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.GetLkbMessageResponse")
    public String getLkbMessage(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "xqmc", targetNamespace = "http://impl.service.company.hzfc.com")
                    String xqmc);

    /**
     * 
     * @param superDao
     */
    @WebMethod(action = "urn:setSuperDao")
    @Oneway
    @RequestWrapper(localName = "setSuperDao", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SetSuperDao")
    public void setSuperDao(
            @WebParam(name = "superDao", targetNamespace = "http://impl.service.company.hzfc.com")
                    SuperDao superDao);

    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:revokeHtByHtbh")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "revokeHtByHtbh", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.RevokeHtByHtbh")
    @ResponseWrapper(localName = "revokeHtByHtbhResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.RevokeHtByHtbhResponse")
    public String revokeHtByHtbh(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @param token
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:checkStateByFwcodeEncrypt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "checkStateByFwcodeEncrypt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.CheckStateByFwcodeEncrypt")
    @ResponseWrapper(localName = "checkStateByFwcodeEncryptResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.CheckStateByFwcodeEncryptResponse")
    public String checkStateByFwcodeEncrypt(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @param token
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveFwEncrypt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveFwEncrypt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFwEncrypt")
    @ResponseWrapper(localName = "saveFwEncryptResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFwEncryptResponse")
    public String saveFwEncrypt(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @param token
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveFjEncrypt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveFjEncrypt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFjEncrypt")
    @ResponseWrapper(localName = "saveFjEncryptResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFjEncryptResponse")
    public String saveFjEncrypt(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:updateFwZt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "updateFwZt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.UpdateFwZt")
    @ResponseWrapper(localName = "updateFwZtResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.UpdateFwZtResponse")
    public String updateFwZt(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @param token
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:updateFwZtEncrypt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "updateFwZtEncrypt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.UpdateFwZtEncrypt")
    @ResponseWrapper(localName = "updateFwZtEncryptResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.UpdateFwZtEncryptResponse")
    public String updateFwZtEncrypt(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @param token
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:revokeHtByHtbhEncrypt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "revokeHtByHtbhEncrypt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.RevokeHtByHtbhEncrypt")
    @ResponseWrapper(localName = "revokeHtByHtbhEncryptResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.RevokeHtByHtbhEncryptResponse")
    public String revokeHtByHtbhEncrypt(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveHtTp")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveHtTp", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtTp")
    @ResponseWrapper(localName = "saveHtTpResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtTpResponse")
    public String saveHtTp(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param filename
     * @param data
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveHtTpData")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveHtTpData", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtTpData")
    @ResponseWrapper(localName = "saveHtTpDataResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtTpDataResponse")
    public String saveHtTpData(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr,
            @WebParam(name = "filename", targetNamespace = "http://impl.service.company.hzfc.com")
                    String filename,
            @WebParam(name = "data", targetNamespace = "http://impl.service.company.hzfc.com")
                    byte[] data)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param dsrlist
     * @param token
     * @param info
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveHt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveHt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHt")
    @ResponseWrapper(localName = "saveHtResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtResponse")
    public String saveHt(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "info", targetNamespace = "http://impl.service.company.hzfc.com")
                    String info,
            @WebParam(name = "dsrlist", targetNamespace = "http://impl.service.company.hzfc.com")
                    String dsrlist)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveHtPdfIo")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveHtPdfIo", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtPdfIo")
    @ResponseWrapper(localName = "saveHtPdfIoResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveHtPdfIoResponse")
    public String saveHtPdfIo(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param filename
     * @param data
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveFwTpData")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveFwTpData", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFwTpData")
    @ResponseWrapper(localName = "saveFwTpDataResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFwTpDataResponse")
    public String saveFwTpData(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr,
            @WebParam(name = "filename", targetNamespace = "http://impl.service.company.hzfc.com")
                    String filename,
            @WebParam(name = "data", targetNamespace = "http://impl.service.company.hzfc.com")
                    byte[] data)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param token
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:checkToken")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "checkToken", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.CheckToken")
    @ResponseWrapper(localName = "checkTokenResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.CheckTokenResponse")
    public String checkToken(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveFwTp")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveFwTp", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFwTp")
    @ResponseWrapper(localName = "saveFwTpResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFwTpResponse")
    public String saveFwTp(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @param token
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveZlryEncrypt")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveZlryEncrypt", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveZlryEncrypt")
    @ResponseWrapper(localName = "saveZlryEncryptResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveZlryEncryptResponse")
    public String saveZlryEncrypt(
            @WebParam(name = "token", targetNamespace = "http://impl.service.company.hzfc.com")
                    String token,
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:checkStateByFwcode")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "checkStateByFwcode", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.CheckStateByFwcode")
    @ResponseWrapper(localName = "checkStateByFwcodeResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.CheckStateByFwcodeResponse")
    public String checkStateByFwcode(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

    /**
     * 
     * @param jsonstr
     * @return
     *     returns java.lang.String
     * @throws RentQyServiceException_Exception
     */
    @WebMethod(action = "urn:saveFj")
    @WebResult(targetNamespace = "http://impl.service.company.hzfc.com")
    @RequestWrapper(localName = "saveFj", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFj")
    @ResponseWrapper(localName = "saveFjResponse", targetNamespace = "http://impl.service.company.hzfc.com", className = "com.hzfc.company.service.impl.SaveFjResponse")
    public String saveFj(
            @WebParam(name = "jsonstr", targetNamespace = "http://impl.service.company.hzfc.com")
                    String jsonstr)
        throws RentQyServiceException_Exception
    ;

}

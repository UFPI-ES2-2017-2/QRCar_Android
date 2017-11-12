package es.ufpi.br.qrcar.repository;

import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.QRCode;

public class QRCodesRepository {
    private List<QRCode> qr_codes;

    public QRCodesRepository(){
        this.qr_codes = new LinkedList<QRCode>();
    }

    public void insertQRCode(QRCode qr_code){
        qr_codes.add(qr_code);
    }

    /**
     * Searches a qr_code by a qr_code ID
     * @param qr_code id
     * @return User
     */
    public QRCode searchQRCode(int qr_code){
        QRCode aux = null;

        for (QRCode q : qr_codes){
            if (q.getQr_code() == (qr_code)){
                aux = q;
                break;
            }else{
                aux = null;
            }
        }
        return aux;
    }

    /**
     * Lists all qr_codes on the repository
     * @return
     */
    public List<QRCode> getQRCodes(){
        return qr_codes;
    }

    /**
     * Populates data of qr_codes randomly for tests purposes only
     */
    public void populateQRCodeRepository(){
        QRCode qr_code1 = new QRCode();
        qr_code1.setCar_id(321);
        qr_code1.setQr_code(888);
        insertQRCode(qr_code1);
    }
}
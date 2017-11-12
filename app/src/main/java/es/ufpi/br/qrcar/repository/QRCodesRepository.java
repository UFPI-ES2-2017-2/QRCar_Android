package es.ufpi.br.qrcar.repository;

import java.util.LinkedList;
import java.util.List;

import es.ufpi.br.qrcar.entity.QRCode;

public class QRCodesRepository implements IQRCodesRepository{
    private List<QRCode> qr_codes;

    public QRCodesRepository(){
        this.qr_codes = new LinkedList<QRCode>();
    }

    public Boolean insertQRCode(QRCode qr_code){
        if(qr_codes.add(qr_code))
            return true;
        return false;
    }

    public Boolean removeQRCode(QRCode qr_code){
        if(qr_codes.remove(qr_code))
            return true;
        return false;
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
    public List<QRCode> list(){
        return qr_codes;
    }

    /**
     * Edits a qr_code's entry on the repository
     * @return Boolean
     */
    public Boolean editQRCode(QRCode original, QRCode new_qr_code){
        for (QRCode q : qr_codes){
            if (q.equals(original)){
                q = new_qr_code;
                return true;
            }
        }
        return false;
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
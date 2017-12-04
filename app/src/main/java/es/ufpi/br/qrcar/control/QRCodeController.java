package es.ufpi.br.qrcar.control;

import es.ufpi.br.qrcar.entity.QRCode;
import es.ufpi.br.qrcar.repository.QRCodesRepository;

import java.io.Serializable;
import java.util.List;

public class QRCodeController implements Serializable {
    private QRCodesRepository qr_codes;

    public QRCodeController()
    {
        this.qr_codes = new QRCodesRepository();
    }

    public Boolean insertQRCode(QRCode q)
    {
        return this.qr_codes.insertQRCode(q);
    }

    public Boolean removeQRCode(QRCode q)
    {
        return this.qr_codes.removeQRCode(q);
    }

    public List<QRCode> listQRCodes()
    {
        return this.qr_codes.list();
    }

    public QRCode searchQRCode(int qr_code)
    {
        return this.qr_codes.searchQRCode(qr_code);
    }

    public Boolean editQRCode(QRCode oldQ, QRCode newQ) {
        return this.qr_codes.editQRCode(oldQ, newQ);
    }


}
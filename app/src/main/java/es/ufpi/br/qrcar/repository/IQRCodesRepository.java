package es.ufpi.br.qrcar.repository;

import java.util.List;
import es.ufpi.br.qrcar.entity.QRCode;

public interface IQRCodesRepository {
    public Boolean insertQRCode(QRCode q);
    public Boolean removeQRCode(QRCode q);
    public List<QRCode> list();
    public QRCode searchQRCode(int qr_code);
    public Boolean editQRCode(QRCode original, QRCode new_qr_code);
}
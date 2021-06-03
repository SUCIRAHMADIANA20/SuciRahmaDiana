package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelhasil;
    private JLabel labelSatu;
    private JLabel labelTiga;
    private JLabel labelDua;
    private JLabel labelEmpat;
    private JLabel labelLima;
    private JLabel labelEnam;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textNama
                String nama = textNama.getText();
                //Mengambil data dari textNim
                String nim = textNim.getText();
                //DiProses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);


                //Tampilkan output ke Form
                labelSatu.setText("Jenjang Pendidikan = " + mhs.getJenjangPendidikan());
                labelDua.setText("Tahun Masuk = " + mhs.getTahunMasuk());
                labelTiga.setText("Fakultas = " + mhs.getFakultas());
                labelEmpat.setText("Jurusan = " + mhs.getJurusan());
                labelLima.setText("JK = " + mhs.getJenisKelamin());
                labelEnam.setText("No Urut = " + mhs.getNoUrutMahasiswa());

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}

package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "karyawan")
public class Karyawan implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nip", length = 20, unique = true, nullable = false)
    private String nip;
    
    @Column(name = "nama", length = 100, nullable = false)
    private String nama;
    
    @Column(name = "jenis_kelamin", length = 1, nullable = false)
    private String jenisKelamin;
    
    @Column(name = "tanggal_lahir")
    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;
    
    @Column(name = "alamat")
    private String alamat;
    
    @Column(name = "email", length = 100)
    private String email;
    
    @Column(name = "telepon", length = 15)
    private String telepon;
    
    @Column(name = "jabatan", length = 50, nullable = false)
    private String jabatan;
    
    @Column(name = "gaji")
    private Double gaji;
    
    @Column(name = "tanggal_masuk", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date tanggalMasuk;
    
    @Column(name = "status", length = 10)
    private String status;
    
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    // Constructors
    public Karyawan() {
        this.status = "Aktif";
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public Karyawan(String nip, String nama, String jenisKelamin, String jabatan, Date tanggalMasuk) {
        this();
        this.nip = nip;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
        this.tanggalMasuk = tanggalMasuk;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public Double getGaji() {
        return gaji;
    }

    public void setGaji(Double gaji) {
        this.gaji = gaji;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Karyawan{" + 
               "id=" + id +
               ", nip='" + nip + '\'' +
               ", nama='" + nama + '\'' +
               ", jabatan='" + jabatan + '\'' +
               ", gaji=" + gaji +
               ", status='" + status + '\'' +
               '}';
    }
}
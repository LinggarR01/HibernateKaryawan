# CRUD Karyawan dengan Hibernate dan JasperReports

Proyek aplikasi desktop Java Swing untuk pengelolaan data karyawan, menggunakan Hibernate sebagai ORM dan JasperReports untuk pembuatan laporan.

## Fitur Utama

### **Manajemen Data Karyawan**
- Tambah data karyawan baru
- Tampilkan semua data karyawan
- Edit data karyawan yang ada
- Hapus data karyawan

### **Data Karyawan Lengkap**
- NIP (Nomor Induk Pegawai)
- Nama lengkap
- Jenis kelamin (L/P)
- Tanggal lahir
- Alamat
- Email
- Nomor telepon
- Jabatan
- Gaji
- Tanggal masuk
- Status (Aktif/Non-Aktif)

### **Laporan dan Export**
- **Cetak Laporan**: Generate laporan data karyawan langsung dari aplikasi
- **Export ke PDF**: Simpan laporan dalam format PDF

### **Teknologi yang Digunakan**
- **ORM**: Hibernate 4.3.1 untuk mapping object-relational
- **Database**: MySQL dengan tabel karyawan terstruktur
- **GUI**: Java Swing dengan NetBeans GUI Builder
- **Reporting**: JasperReports untuk laporan PDF
- **Session Management**: Hibernate SessionFactory

## **Teknologi & Tools**

- **IDE**: NetBeans 8.2+
- **Java**: JDK 8
- **Database**: MySQL 5.7+
- **ORM**: Hibernate 4.3.1
- **Reporting**: JasperReports 6.0+
- **Database Server**: XAMPP/Laragon/WAMP
- **Version Control**: Git & GitHub


## **Instalasi & Setup**

### **1. Prasyarat**
- Install [JDK 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
- Install [NetBeans 8.2](https://netbeans.apache.org/)
- Install [XAMPP](https://www.apachefriends.org/) atau Laragon
- Install [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)

### **2. Setup Database**
-- Buat database
CREATE DATABASE perusahaan;

-- Gunakan database
USE perusahaan;

-- Buat tabel karyawan
CREATE TABLE karyawan (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nip VARCHAR(20) UNIQUE NOT NULL,
    nama VARCHAR(100) NOT NULL,
    jenis_kelamin ENUM('L', 'P') NOT NULL,
    tanggal_lahir DATE,
    alamat TEXT,
    email VARCHAR(100),
    telepon VARCHAR(15),
    jabatan VARCHAR(50) NOT NULL,
    gaji DECIMAL(12,2),
    tanggal_masuk DATE NOT NULL,
    status ENUM('Aktif', 'Non-Aktif') DEFAULT 'Aktif',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

## Author

[Linggar, 50422808]

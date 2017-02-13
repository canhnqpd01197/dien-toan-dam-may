CREATE DATABASE QLBH
GO
USE QLBH

CREATE TABLE KhachHang(
username varchar(50) not null primary key,
pass varchar(20) not null,
vaiTro varchar(10) not null,
hoTen varchar(50) not null,
gioiTinh varchar(5) not null,
ngaySinh date not null,
soCMND varchar(20) not null,
soDT varchar(11) not null,
email varchar(50)
)

CREATE TABLE LoaiSP(
maLoai varchar(10) not null primary key,
tenLoai varchar(50) not null
)

CREATE TABLE SP(
maSP varchar(10) not null primary key,
tenSP varchar(50) not null,
moTa varchar(100) not null,
soLuong int not null,
donGia float not null,
nhaSanXuat varchar(50) not null,
maLoai varchar(10) not null,
hinhAnh varchar(200) not null,
foreign key(maLoai) references LoaiSP(maLoai) ON DELETE CASCADE
)

CREATE TABLE HoaDon(
maHoaDon varchar(10) not null primary key,
username varchar(50) not null,
ngayMua date not null,
trangThai varchar(20) not null,
foreign key(username) references KhachHang(username) ON DELETE CASCADE
)

CREATE TABLE ChiTietHoaDon(
maChiTietHoaDon varchar(10) not null primary key,
maHoaDon varchar(10) not null,
maSP varchar(10) not null,
soLuong int not null,
giaTien float not null,
foreign key(maHoaDon) references HoaDon(maHoaDon) ON DELETE CASCADE, 
foreign key(maSP) references SP(maSP) ON DELETE CASCADE
)

INSERT into KhachHang values('canh','canh123','AD','Nguyen Quoc Canh','Nam','09/18/1995','233213653','0911776579','canhnqpd01197@fpt.edu.vn'),
('lien','lien123','KH','Tran Thi Thuy Lien','Nu','06/05/1997','24585384','01658441001','lien@fpt.edu.vn'),
('gia','gia123','KH','Che Bong Gia','Nam','05/13/1995','234853541','01658552475','gia@fpt.edu.vn'),
('hoang','hoang123','KH','Nguyen Thi Hoang','Nam','08/18/1996','568975321','01665225775','hoang@fpt.edu.vn'),
('phuc','phuc123','KH','Le Van Phuc','Nam','09/28/1996','786945369','01663221521','phuc@fpt.edu.vn')

INSERT into LoaiSP values('l1','Sua Tam'),
('l2','Kem tri mun'),
('l3','Kem trang da'),
('l4','Kem tri nam'),
('l5','Kem tri tham')

INSERT into SP values('sp1','Sua tam Dove','Trang ngay lap tuc',50,120000,'Dove','l1','suatamdove.jpg'),
('sp2','Kem tri mun acnes','Het mun ngay lap tuc',50,200000,'Acnes','l2','acne.jpg'),
('sp3','Kem White doctors','Trang ngay lap tuc',50,500000,'White doctors','l3','white doctor.png'),
('sp4','Kem Kami skin','Het nam ngay lap tuc',50,300000,'Kami','l4','Kami skin.png'),
('sp5','Kem tri tham Nivea','Cho lan da min mang, mo vet tham',50,90000,'Nivea','l5','Nivea.jpg')

INSERT into HoaDon values('HD1','lien','12/12/2016','OK'),
('HD2','phuc','11/12/2016','OK'),
('HD3','hoang','10/12/2016','OK'),
('HD4','gia','1/12/2016','OK'),
('HD5','lien','3/12/2016','OK')

INSERT INTO ChiTietHoaDon values('CTHD1','HD1','SP1',2,240000),
('CTHD2','HD2','SP2',1,200000),
('CTHD3','HD3','SP3',1,50000),
('CTHD4','HD4','SP4',1,300000),
('CTHD5','HD5','SP5',3,270000)

package com.example.producingwebservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class HoSoDvcBieuMauDto implements Serializable {

    @JsonProperty("Dien_thoai_nn")
    private String dienThoaiNn;

    @JsonProperty("Donvi_csgt")
    private String donViCsgt;

    @JsonProperty("Email")
    private String emailNn;

    @JsonProperty("Giay_to_Dien_thoai_cx")
    private String giayToDienThoaiChuXe;

    @JsonProperty("Giay_to_Email_cx")
    private String giayToEmailChuXe;

    @JsonProperty("Giay_to_Ngay_cap")
    private String giayToNgayCap;

    @JsonProperty("Giay_to_Noi_cap")
    private String giayToNoiCap;

    @JsonProperty("Giay_to_So_giayto")
    private String giayToSoGiayto;

    @JsonProperty("IDS_BCA_BTN_TRACUU")
    private String idsBcaBtnTraCuu;

    @JsonProperty("IDS_BCA_CAP_NGAY_SO_GIAY_PHEP_KINH_DOANH_VAN_TAI")
    private String idsBcaCapNgaySoGiayPhepKinhDoanhVanTai;

    @JsonProperty("IDS_BCA_NOI_CAP_SO_GIAY_PHEP_KINH_DOANH_VAN_TAI")
    private String idsBcaNoiCapSoGiayPhepKinhDoanhVanTai;

    @JsonProperty("IDS_CHU_XE_CHI_TIET_TAM_TRU")
    private String idsChuXeChiTietTamTru;

    @JsonProperty("IDS_CHU_XE_HUYEN_TAM_TRU")
    private String idsChuXeHuyenTamTru;

    @JsonProperty("IDS_CHU_XE_LOAI_GIAY_TO")
    private String idsChuXeLoaiGiayTo;

    @JsonProperty("IDS_CHU_XE_NOI_O_HIEN_TAI")
    private String idsChuXeNoiOHienTai;

    @JsonProperty("IDS_CHU_XE_QUOC_TICH")
    private String idsChuXeQuocTich;

    @JsonProperty("IDS_CHU_XE_TINH_TAM_TRU")
    private String idsChuXeTinhTamTru;

    @JsonProperty("IDS_CHU_XE_XA_TAM_TRU")
    private String idsChuXeXaTamTru;

    @JsonProperty("IDS_DAU_GIA_BIEN_SO")
    private String idsDauGiaBienSo;

    @JsonProperty("IDS_DAU_GIA_CO_QUAN_CAP")
    private String idsDauGiaCoQuanCap;

    @JsonProperty("IDS_DAU_GIA_NGAY_CAP")
    private String idsDauGiaNgayCap;

    @JsonProperty("IDS_DAU_GIA_SO_GIAY_XAC_NHAN")
    private String idsDauGiaSoGiayXacNhan;

    @JsonProperty("IDS_LA_BIEN_SO_DAU_GIA")
    private String idsLaBienSoDauGia;

    @JsonProperty("IDS_LA_CHU_XE")
    private String idsLaChuXe;

    @JsonProperty("IDS_LA_NGUOI_KHAI_HO")
    private String idsLaNguoiKhaiHo;

    @JsonProperty("IDS_NDUQ_CO_QUAN_CAP")
    private String idsNduqCoQuanCap;

    @JsonProperty("IDS_NDUQ_HO_TEN")
    private String idsNduqHoten;

    @JsonProperty("IDS_NDUQ_LOAI_GIAY_TO")
    private String idsNduqLoaiGiayTo;

    @JsonProperty("IDS_NDUQ_MA_DINH_DANH")
    private String idsNduqMaDinhDanh;

    @JsonProperty("IDS_NDUQ_NGAY_CAP")
    private String idsNduqNgayCap;

    @JsonProperty("IDS_TTX_CHUNG_TU_CQSH")
    private String idsTtxChungTuCqsh;

    @JsonProperty("IDS_TTX_CO_KDVT")
    private String idsTtxCoKdvt;

    @JsonProperty("IDS_TTX_CO_QUAN_CAP_CQSH")
    private String idsTtxCoQuanCapCqsh;

    @JsonProperty("IDS_TTX_DUNG_TICH")
    private String udsTtxDungTich;

    @JsonProperty("IDS_TTX_KICH_THUOC_BAO")
    private String idsTtxKichThuocBao;

    @JsonProperty("IDS_TTX_KICH_THUOC_THUNG")
    private String idsTtxKichThuocThung;

    @JsonProperty("IDS_TTX_NAM_SX")
    private String idsTtxNamSx;

    @JsonProperty("IDS_TTX_NGAY_CAP_CQSH")
    private String idsTtxNgayCapCqsh;

    @JsonProperty("IDS_TTX_NGAY_CAP_HQDT")
    private String idsTtxNgayCapHdqt;

    @JsonProperty("IDS_TTX_NGAY_CAP_LPTB")
    private String idsTtxNgayCapLptb;

    @JsonProperty("IDS_TTX_NGAY_CAP_SERI_KTCLXX")
    private String idsTtxNgayCapSeriKtclxx;

    @JsonProperty("IDS_TTX_SO_CHO_DUNG")
    private String idsTtxSoChoDung;

    @JsonProperty("IDS_TTX_SO_CHO_NAM")
    private String idsTtxSoChoNam;

    @JsonProperty("IDS_TTX_SO_CHO_NGOI")
    private String idsTtxSoChoNgoi;

    @JsonProperty("IDS_TTX_TAI_TRONG_HANG_HOA")
    private String idsTtxTaiTrongHangHoa;

    @JsonProperty("IDS_TTX_TRONG_LUONG_BAN_THAN")
    private String idsTtxTrongLuongBanThan;

    @JsonProperty("IDS_TTX_TRONG_LUONG_KEO_THEO")
    private String idsTtxTrongLuongKeoTheo;

    @JsonProperty("IDS_TTX_TRONG_LUONG_TOAN_BO")
    private String idsTtxTrongLuongToanBo;

    @JsonProperty("LPTB_coquancap")
    private String lptpCoQuanCap;

    @JsonProperty("Loai_xe")
    private String loaiXe;

    @JsonProperty("Ma_hs_lptb")
    private String maHsLptb;

    @JsonProperty("Mau_son")
    private String mauSon;

    @JsonProperty("Noi_dkhktt_Chitiet_hk")
    private String noiDkhkttChiTietHk;

    @JsonProperty("Noi_dkhktt_Phuong_hk")
    private String noiDkhkttPhuongHk;

    @JsonProperty("Noi_dkhktt_Quan_hk")
    private String noiDkhkttQuanHk;

    @JsonProperty("Noi_dkhktt_Tinh_hk")
    private String noiDkhkttTinhHk;

    @JsonProperty("Seri_phieu_ktclxx")
    private String seriPhieuKtClXx;

    @JsonProperty("So_khung")
    private String soKhung;

    @JsonProperty("So_loai")
    private String soLoai;

    @JsonProperty("So_may1")
    private String soMay1;

    @JsonProperty("So_may2")
    private String soMay2;

    @JsonProperty("So_tk_hq")
    private String soToKhaiHq;

    @JsonProperty("Tt_nguoi_nhan_Ho_ten")
    private String ttNguoiNhanHoten;

    @JsonProperty("Tt_nguoi_nhan_So_dien_thoai")
    private String ttNguoiNhanSdt;

    @JsonProperty("co_quan_cap_ktclxx")
    private String cqCapKtclxx;

    @JsonProperty("co_quan_cap_tkhq")
    private String cqCapTkhq;

    @JsonProperty("danh_dau_tra_cuu_DangKiem")
    private String danhDauTraCuuDangKiem;

    @JsonProperty("danh_dau_tra_cuu_ThongTinHaiQuan")
    private String danhDauTraCuuThongTinHq;

    @JsonProperty("danh_dau_tra_cuu_ThongTinLPTB")
    private String danhDauTraCuuTtLptb;

    @JsonProperty("diem_dang_ky")
    private String diemDk;

    @JsonProperty("gpkdvt_So_gp")
    private String soGpKdvt;

    @JsonProperty("gpkdvt_Noi_cap")
    private String noiCapGpKdvt;

    @JsonProperty("gpkdvt_Ngay_cap")
    private String ngayCapGpKdvt;

    @JsonProperty("ho_ten_cx")
    private String hoTenChuXe;

    @JsonProperty("nam_sinh_cx")
    private String namSinhChuXe;

    @JsonProperty("nhan_hieu")
    private String nhanHieu;

    @JsonProperty("nhanketqua_dcchitiet")
    private String nhanKqDcChiTiet;

    @JsonProperty("nhanketqua_hinhthuc")
    private String nhanKqDcHinhThuc;

    @JsonProperty("nhanketqua_phuongxa")
    private String nhanKqPhuongXa;

    @JsonProperty("nhanketqua_quanhuyen")
    private String nhanKqQuanHuyen;

    @JsonProperty("nhanketqua_tinhthanh")
    private String nhanKqTinhThanh;

    @JsonProperty("thong_tin_traCuu_TTDKXDangKiem")
    private String ttTraCuuTtDkxDangKiem;

    @JsonProperty("thong_tin_traCuu_ThongTinHaiQuan")
    private String ttTraCuuTtHq;

    @JsonProperty("thong_tin_traCuu_ThongTinLPTB")
    private String ttTraCuuTtLptb;

    @JsonProperty("tracuu_kieusanxuat")
    private String traCuuKieuSX;

    @JsonProperty("tracuu_ma_hs_lptb")
    private String traCuuMaHsLptb;

    @JsonProperty("ttx_Loai_xe")
    private String ttxLoaiXe;

    @JsonProperty("ttx_So_khung")
    private String ttxSoKhung;

    @JsonProperty("txt_Seri_phieu_ktclxx")
    private String txtSeriPhieuKtclxx;

    @JsonProperty("IDS_BCA_EMAIL_CD")
    private String idsBcaEmailCd;

    @JsonProperty("IDS_BCA_SO_DIEN_THOAI_CD")
    private String idsBcaSdtCd;

    @JsonProperty("Noi_o_hientai_Chitiet_noio")
    private String noiOHienTaiChiTietNoiO;

    @JsonProperty("So_hoa_don")
    private String soHoaDon;

    @JsonProperty("Ma_so_thue")
    private String maSoThue;

    @JsonProperty("Bien_so")
    private String bienSo;

    @JsonProperty("bien_so_xe")
    private String bienSoXe;

    @JsonProperty("tracuu_bienso")
    private String traCuuBienSo;

    @JsonProperty("mau_bien")
    private String mauBien;

    @JsonProperty("tracuu_maubien")
    private String traCuuMauBien;

    @JsonProperty("Cq_cn_denghi")
    private String cqCnDeNghi;

    @JsonProperty("Diachi_lienhe")
    private String diaChiLienHe;

    @JsonProperty("Hinhthuc_tra")
    private String hinhThucTra;

    @JsonProperty("Muc_dich_sd")
    private String mucDichSuDung;

    @JsonProperty("Sdt_lienhe")
    private String sdtLienHe;

    @JsonProperty("Tt_nguoi_khai_Email")
    private String ttNguoiKhaiEmail;

    @JsonProperty("Tt_nguoi_khai_Ho_ten")
    private String ttNguoiKhaiHoTen;

    @JsonProperty("Tt_nguoi_khai_So_dien_thoai")
    private String ttNguoiKhaiSdt;

    @JsonProperty("Tt_nguoi_khai_cmnd")
    private String ttNguoiKhaiCmnd;

    @JsonProperty("Tt_nguoi_khai_dia_chi")
    private String ttNguoiKhaiDiaChi;

    @JsonProperty("Tt_nguoi_nhan_dia_chi")
    private String ttNguoiNhanDiaChi;

    @JsonProperty("thoi_gian_su_dung")
    private String thoiGianSuDung;

    @JsonProperty("ly_do_thu_hoi")
    private String lydoThuHoi;

    @JsonProperty("ly_do_cap_doi")
    private String lyDoCapDoi;

    @JsonProperty("kieu_cap_lai")
    private String kieuCapLai;

    @JsonProperty("nam_san_xuat")
    private String namSanXuat;

    @JsonProperty("dung_tich_xilanh_congsuat")
    private String dungTichXiLanhCongSuat;

    @JsonProperty("kich_thuc_bao_dai")
    private String kichThucBaoDai;

    @JsonProperty("kich_thuc_rong")
    private String kichThucRong;

    @JsonProperty("kich_thuc_cao")
    private String kichThucCao;

    @JsonProperty("khoi_luong_banthan_kg")
    private String khoiLuongBanThanKg;

    @JsonProperty("kich_co_lop")
    private String kichCoLop;

    @JsonProperty("khoi_luong_hang_chuyen_cho")
    private String khoiLuongHangChuyenCho;

    @JsonProperty("khoi_luong_keo_theo_kg")
    private String khoiLuongKeoTheoKg;

    @JsonProperty("kich_thuoc_thung")
    private String kichThuocThung;

    @JsonProperty("chieu_cao_cs")
    private String chieuCaoCoSo;

    @JsonProperty("pham_vi_hd")
    private String phamViHoatDong;

    @JsonProperty("so_cho_ngoi")
    private String soChoNgoi;

    @JsonProperty("tracuu_loaidangky")
    private String traCuuLoaiDangKy;

    @JsonProperty("loai_doi_lai")
    private String loaiDoiLai;

    @JsonProperty("noi_den")
    private String noiDen;

    @JsonProperty("noi_di")
    private String noiDi;

    @JsonProperty("thoi_han_den_ngay")
    private String thoiHanDenNgay;

    @JsonProperty("thoi_han_tu_ngay")
    private String thoiHanTuNgay;

    @JsonProperty("thoi_han_ngay")
    private String thoiHanNgay;

    @JsonProperty("IDS_TTX_CONG_SUAT")
    private String idsTtxCongSuat;

    @JsonProperty("IDS_CHU_MOI_MA_DINH_DANH")
    private String giayToSoGiaytoMoi;

    @JsonProperty("IDS_CHU_MOI_HO_TEN")
    private String hoTenChuMoi;

    @JsonProperty("IDS_CHU_MOI_DIA_CHI")
    private String diaChiChuMoi;

    @JsonProperty("IDS_CHU_MOI_SDT")
    private String soDtChuMoi;

    @JsonProperty("LPTB_Ma_hs")
    private String lptbMaHs;

    @JsonProperty("LPTB_trangthainop")
    private String lptbTrangThaiNop;

    @JsonProperty("so_gcn_thu_hoi")
    private String soGcnThuHoi;

    @JsonProperty("ngay_thu_hoi")
    private String ngayThuHoi;

    @JsonProperty("co_quan_thu_hoi")
    private String coQuanThuHoi;

    @JsonProperty("gpkdvt")
    private String gpKdvt;

    @JsonProperty("tracuu_truonghopdangkytam")
    private String isDangKyTam;

    @JsonProperty("cua_khau_tam_nhap")
    private String cuaKhauTamNhap;

    @JsonProperty("bien_so_nuoc_ngoai")
    private String bienSoNuocNgoai;

    @JsonProperty("cua_khau_tai_nhap")
    private String cuaKhauTaiNhap;

    @JsonProperty("ngay_tam_nhap")
    private String ngayTamNhap;

    @JsonProperty("thoi_han_tam_nhap")
    private String thoiHanTamNhap;

    @JsonProperty("ngay_tai_xuat")
    private String ngayTaiXuat;

    @JsonProperty("muc_dich_vao_vn")
    private String mucDichVaoVn;

    @JsonProperty("co_quan_cap_phep")
    private String coQuanCapPhep;

    @JsonProperty("ngay_cap_phep")
    private String ngayCapPhep;


}
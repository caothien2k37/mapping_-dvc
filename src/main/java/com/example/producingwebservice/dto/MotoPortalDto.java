package com.example.producingwebservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MotoPortalDto {

    @Column(name = "ID_SO")
    private String idSo = "idSo01";

    @Column(name = "LOAI_GIAYTO")
    private String loaiGiayTo;

    @Column(name = "ID_NGAY_CAP")
    private String idNgayCap;

    @Column(name = "ID_NOI_CAP")
    private String idNoiCap;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "NGAY_SINH")
    private String ngaySinh;

    @Column(name = "QUOC_GIA_ID")
    private String quocGiaId;

    @Column(name = "MA_DON_VI")
    private String maDonVi;

    @Column(name = "TINH_ID")
    private String tinhId;

    @Column(name = "QUAN_ID")
    private String quanId;

    @Column(name = "DIADANH_HANHCHINH_ID")
    private String diaDanhHanhChinhId;

    @Column(name = "DIA_CHI_CHI_TIET_HK")
    private String diaChiChiTietHk;

    @Column(name = "MA_QUAN_HUYEN_TT")
    private String maQuanHuyenTt;

    @Column(name = "MA_PHUONG_XA_TT")
    private String maPhuongXaTt;

    @Column(name = "DIA_CHI_CHI_TIET_TAM_TRU")
    private String diaChiChiTietTamTru;

    @Column(name = "SO_DIEN_THOAI")
    private String soDienThoai;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TEN_NG_LAM_TT")
    private String tenNgLamTt;

    @Column(name = "ID_NG_LAM_TT")
    private String idNguoiLamTt;

    @Column(name = "MA_GIAY_TO_NG_LAM_TT")
    private String maGiayToNgLamTt;

    @Column(name = "ID_NG_LAM_TT_NGAY_CAP")
    private String idNgLamTtNgayCap;

    @Column(name = "ID_NG_LAM_TT_NOI_CAP")
    private String idNgLamTtNoiCap;

    @Column(name = "SO_DT_NG_LAM_TT")
    private String soDtNgLamTt;

    @Column(name = "EMAIL_NG_LAM_TT")
    private String emailNgLamTt;

    @Column(name = "NGAY_CAP_LPTB")
    private String ngayCapLptb;

    @Column(name = "ID_NG_LAM_TT_NOI_CAP")
    private String idNguoiLamTtNoiCap;

    @Column(name = "CQ_CAP_MA_LPTB")
    private String cqCapMaLptb;

    @Column(name = "SO_CHUNG_TU")
    private String soChungTu;

    @Column(name = "NGAYCAP_CHUNGTU")
    private String ngayCap;

    @Column(name = "COQUAN_CAPCHUNGTU")
    private String coQuanCapChungTu;

    @Column(name = "SO_GP_KDVT")
    private String soGpKdvt;

    @Column(name = "LOAI_XE_TEXT")
    private String loaiXeText;

    @Column(name = "NGUOI_NHAN")
    private String nguoiNhan;

    @Column(name = "SO_DT_NGUOINHAN")
    private String soDtNguoiNhan;

    @Column(name = "MA_TINH_THANH_NGUOINHAN")
    private String maTinhThanhNguoiNhan;

    @Column(name = "MA_QUAN_HUYEN_NGUOINHAN")
    private String maQuanHuyenNguoiNhan;

    @Column(name = "MA_PHUONG_XA_NGUOINHAN")
    private String maPhuongXaNguoiNhan;

    @Column(name = "DIA_CHI_NGUOINHAN")
    private String diaChiNguoiNhan;

    @Column(name = "MA_NOP_THUE_TRUOC_BA")
    private String maNopThueTruocBa;

    @Column(name = "TRANG_THAI_NOP_LPTB")
    private String trangThaiNoiLptb;

    @Column(name = "LYDO_THUHOI_DOICAP")
    private String lyDoThuHoiDoiCap;

    @Column(name = "MAU_BIEN")
    private String mauBien;

    @Column(name = "DIA_CHI")
    private String diaChi;

    @Column(name = "LOAI_NGUOI_NOP")
    private String loaiNguoiNop;

}

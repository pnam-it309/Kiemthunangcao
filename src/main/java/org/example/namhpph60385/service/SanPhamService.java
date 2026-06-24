package org.example.namhpph60385.service;

import org.example.namhpph60385.entity.SanPham;
import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> danhSachSanPham;

    public SanPhamService() {
        this.danhSachSanPham = new ArrayList<>();
    }

    public void Add(SanPham sanPham) {
        if (sanPham == null) {
            throw new IllegalArgumentException("SanPham cannot be null");
        }
        
        if (sanPham.getSoLuong() < 1 || sanPham.getSoLuong() > 100) {
            throw new IllegalArgumentException("So luong phai tu 1 den 100");
        }
        
        if (sanPham.getMa() == null || sanPham.getMa().isEmpty()) {
            throw new IllegalArgumentException("Ma san pham khong duoc de trong");
        }
        
        if (sanPham.getTen() == null || sanPham.getTen().isEmpty()) {
            throw new IllegalArgumentException("Ten san pham khong duoc de trong");
        }
        
        for (SanPham sp : danhSachSanPham) {
            if (sp.getMa().equals(sanPham.getMa())) {
                throw new IllegalArgumentException("Ma san pham da ton tai");
            }
        }
        
        danhSachSanPham.add(sanPham);
    }

    public List<SanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }
}

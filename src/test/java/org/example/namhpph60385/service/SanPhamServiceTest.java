package org.example.namhpph60385.service;

import org.example.namhpph60385.entity.SanPham;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SanPhamServiceTest {

    private SanPhamService sanPhamService;

    @BeforeEach
    public void setUp() {
        sanPhamService = new SanPhamService();
    }

    @Test
    public void Add_miniquantity() {
        SanPham sanPham = new SanPham("SP001", "Ao Thun", 1, 150000.0f, 1, "Ao nam");
        sanPhamService.Add(sanPham);
        assertEquals(1, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_maxquantity() {
        SanPham sanPham = new SanPham("SP002", "Ao So Mi", 2, 300000.0f, 100, "Ao nam");
        sanPhamService.Add(sanPham);
        assertEquals(1, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_invalidquantitymin() {
        SanPham sanPham = new SanPham("SP003", "Ao Khoac", 3, 500000.0f, 0, "Ao nam");
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.Add(sanPham));
        assertEquals(0, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_invalidquantitymax() {
        SanPham sanPham = new SanPham("SP004", "Quan Jean", 1, 400000.0f, 101, "Quan nam");
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.Add(sanPham));
        assertEquals(0, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_normalquantity() {
        SanPham sanPham = new SanPham("SP005", "Ao Polo", 1, 200000.0f, 50, "Ao nam");
        sanPhamService.Add(sanPham);
        assertEquals(1, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_nullSanPham() {
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.Add(null));
        assertEquals(0, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_nullMa() {
        SanPham sanPham = new SanPham(null, "Ao Thun", 1, 150000.0f, 10, "Ao nam");
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.Add(sanPham));
        assertEquals(0, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_emptyMa() {
        SanPham sanPham = new SanPham("", "Ao Thun", 1, 150000.0f, 10, "Ao nam");
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.Add(sanPham));
        assertEquals(0, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_emptyTen() {
        SanPham sanPham = new SanPham("SP006", "", 1, 150000.0f, 10, "Ao nam");
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.Add(sanPham));
        assertEquals(0, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    public void Add_duplicateMa() {
        SanPham sp1 = new SanPham("SP001", "Ao Thun", 1, 150000.0f, 10, "Ao nam");
        SanPham sp2 = new SanPham("SP001", "Ao Khoac", 2, 500000.0f, 5, "Ao nam");
        sanPhamService.Add(sp1);
        assertThrows(IllegalArgumentException.class, () -> sanPhamService.Add(sp2));
        assertEquals(1, sanPhamService.getDanhSachSanPham().size());
    }

}

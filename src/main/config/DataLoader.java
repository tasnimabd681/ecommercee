package com.ecommerce.ecommerce.config.com.ecommerce.config;

import com.ecommerce.ecommerce.model.Category;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.repository.CategoryRepository;
import com.ecommerce.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  // تم التفعيل
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) {
        if (categoryRepository.count() == 0) {
            // ===== التصنيفات =====
            Category ram = new Category(); ram.setName("RAM"); ram.setDescription("Random Access Memory");
            Category hdd = new Category(); hdd.setName("Hard Disk"); hdd.setDescription("Hard Disk Drives");
            Category cpu = new Category(); cpu.setName("CPU"); cpu.setDescription("Central Processing Unit");
            Category laptop = new Category(); laptop.setName("Laptop"); laptop.setDescription("Laptops");
            Category motherboard = new Category(); motherboard.setName("Motherboard"); motherboard.setDescription("Motherboards");
            Category gpu = new Category(); gpu.setName("Graphics Card"); gpu.setDescription("GPUs");
            Category accessory = new Category(); accessory.setName("Accessories"); accessory.setDescription("Laptop Accessories");

            categoryRepository.save(ram);
            categoryRepository.save(hdd);
            categoryRepository.save(cpu);
            categoryRepository.save(laptop);
            categoryRepository.save(motherboard);
            categoryRepository.save(gpu);
            categoryRepository.save(accessory);

            // ===== منتجات RAM =====
            Product p1 = new Product(); p1.setName("Kingston Fury 16GB"); p1.setBrand("Kingston"); p1.setSpecifications("3200MHz DDR4"); p1.setPrice(250); p1.setQuantity(10); p1.setCategory(ram);
            Product p2 = new Product(); p2.setName("Corsair Vengeance 32GB"); p2.setBrand("Corsair"); p2.setSpecifications("3600MHz DDR4"); p2.setPrice(500); p2.setQuantity(5); p2.setCategory(ram);
            Product p3 = new Product(); p3.setName("G.Skill Trident 8GB"); p3.setBrand("G.Skill"); p3.setSpecifications("2400MHz DDR4"); p3.setPrice(120); p3.setQuantity(20); p3.setCategory(ram);

            // ===== هاردات =====
            Product p4 = new Product(); p4.setName("Samsung 980 Pro 1TB"); p4.setBrand("Samsung"); p4.setSpecifications("NVMe PCIe 4.0"); p4.setPrice(450); p4.setQuantity(7); p4.setCategory(hdd);
            Product p5 = new Product(); p5.setName("WD Blue 2TB"); p5.setBrand("Western Digital"); p5.setSpecifications("7200 RPM SATA"); p5.setPrice(300); p5.setQuantity(3); p5.setCategory(hdd);
            Product p5b = new Product(); p5b.setName("Seagate 4TB External"); p5b.setBrand("Seagate"); p5b.setSpecifications("USB 3.0 Portable"); p5b.setPrice(400); p5b.setQuantity(6); p5b.setCategory(hdd);

            // ===== معالجات =====
            Product p6 = new Product(); p6.setName("Intel Core i7-13700K"); p6.setBrand("Intel"); p6.setSpecifications("16 cores, 5.4GHz"); p6.setPrice(1200); p6.setQuantity(4); p6.setCategory(cpu);
            Product p7 = new Product(); p7.setName("AMD Ryzen 9 7950X"); p7.setBrand("AMD"); p7.setSpecifications("16 cores, 5.7GHz"); p7.setPrice(1400); p7.setQuantity(2); p7.setCategory(cpu);

            // ===== لابتوبات =====
            Product p8 = new Product(); p8.setName("Dell XPS 15"); p8.setBrand("Dell"); p8.setSpecifications("Intel i7, 16GB, 512GB SSD"); p8.setPrice(4500); p8.setQuantity(2); p8.setCategory(laptop);
            Product p9 = new Product(); p9.setName("MacBook Pro 14"); p9.setBrand("Apple"); p9.setSpecifications("M3 Pro, 16GB, 512GB"); p9.setPrice(8000); p9.setQuantity(1); p9.setCategory(laptop);
            Product p9b = new Product(); p9b.setName("HP Pavilion 15"); p9b.setBrand("HP"); p9b.setSpecifications("Ryzen 5, 8GB, 256GB SSD"); p9b.setPrice(3200); p9b.setQuantity(5); p9b.setCategory(laptop);

            // ===== مذربوردات =====
            Product p10 = new Product(); p10.setName("MSI B550 Tomahawk"); p10.setBrand("MSI"); p10.setSpecifications("AM4, PCIe 4.0"); p10.setPrice(600); p10.setQuantity(5); p10.setCategory(motherboard);
            Product p11 = new Product(); p11.setName("ASUS ROG Z790"); p11.setBrand("ASUS"); p11.setSpecifications("LGA1700, DDR5"); p11.setPrice(900); p11.setQuantity(3); p11.setCategory(motherboard);

            // ===== كروت شاشة =====
            Product p12 = new Product(); p12.setName("NVIDIA RTX 4070"); p12.setBrand("NVIDIA"); p12.setSpecifications("12GB GDDR6X"); p12.setPrice(2800); p12.setQuantity(2); p12.setCategory(gpu);
            Product p12b = new Product(); p12b.setName("AMD RX 7800 XT"); p12b.setBrand("AMD"); p12b.setSpecifications("16GB GDDR6"); p12b.setPrice(2600); p12b.setQuantity(3); p12b.setCategory(gpu);

            // ===== إكسسوارات لابتوب =====
            Product acc1 = new Product(); acc1.setName("Logitech MX Master 3S"); acc1.setBrand("Logitech"); acc1.setSpecifications("Wireless Mouse, 8K DPI"); acc1.setPrice(350); acc1.setQuantity(15); acc1.setCategory(accessory);
            Product acc2 = new Product(); acc2.setName("Keychron K2 Mechanical Keyboard"); acc2.setBrand("Keychron"); acc2.setSpecifications("Bluetooth, RGB, Brown Switch"); acc2.setPrice(450); acc2.setQuantity(8); acc2.setCategory(accessory);
            Product acc3 = new Product(); acc3.setName("Laptop Cooling Pad"); acc3.setBrand("Cooler Master"); acc3.setSpecifications("5 Fans, Adjustable Height"); acc3.setPrice(120); acc3.setQuantity(20); acc3.setCategory(accessory);
            Product acc4 = new Product(); acc4.setName("Laptop Stand Aluminum"); acc4.setBrand("Omoton"); acc4.setSpecifications("Foldable, Ergonomic"); acc4.setPrice(80); acc4.setQuantity(25); acc4.setCategory(accessory);
            Product acc5 = new Product(); acc5.setName("15.6 inch Laptop Bag"); acc5.setBrand("Targus"); acc5.setSpecifications("Waterproof, Padded"); acc5.setPrice(150); acc5.setQuantity(12); acc5.setCategory(accessory);

            productRepository.save(p1);
            productRepository.save(p2);
            productRepository.save(p3);
            productRepository.save(p4);
            productRepository.save(p5);
            productRepository.save(p5b);
            productRepository.save(p6);
            productRepository.save(p7);
            productRepository.save(p8);
            productRepository.save(p9);
            productRepository.save(p9b);
            productRepository.save(p10);
            productRepository.save(p11);
            productRepository.save(p12);
            productRepository.save(p12b);
            productRepository.save(acc1);
            productRepository.save(acc2);
            productRepository.save(acc3);
            productRepository.save(acc4);
            productRepository.save(acc5);

            System.out.println("✅ تم تحميل البيانات الأولية (منتجات + إكسسوارات)");
        }
    }
}
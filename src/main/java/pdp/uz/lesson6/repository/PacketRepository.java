package pdp.uz.lesson6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.lesson6.entity.Packet;

import java.util.List;
import java.util.UUID;


public interface PacketRepository extends JpaRepository<Packet, UUID> {
    boolean existsByName(String name);
    Packet findByName(String name);
}

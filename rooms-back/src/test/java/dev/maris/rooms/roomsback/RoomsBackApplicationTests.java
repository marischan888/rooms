package dev.maris.rooms.roomsback;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.ApplicationModule;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class RoomsBackApplicationTests {

	@Test
    void verifyArchitecture(){
        ApplicationModules modules = ApplicationModules.of(RoomsBackApplication.class);
        modules.verify();
    }
}

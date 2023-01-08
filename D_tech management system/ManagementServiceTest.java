package com.D_tech.serviceTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.D_tech.entity.Management;
import com.D_tech.repository.ManagementRepository;
import com.D_tech.service.ManagementService;



@SpringBootTest
public class ManagementServiceTest {
	
	@Autowired
	private ManagementService ms;
	
	@MockBean
	private ManagementRepository mrepo;
	
	//testing SaveDepartment of Department service
	@Test
	public void testSaveManagement() {
		
		Management m = new Management();
	m.setMid(100);
	m.setMname("Puja");
		m.setMgender("female");
		m.setMphone(1234456423);
		m.setMemail("puja@gmail.com");
//		m.setMAadhaar(1234567890);
		m.setMcity("Nadia");
	m.setMsalary(25000);	
		
		Mockito.when(mrepo.save(m)).thenReturn(m);
		assertThat(ms.saveManage(m)).isEqualTo(m);
	
		
		Management m1 = new Management();
		m1.setMid(101);
		m1.setMname("Tiyasa");
		m1.setMgender("female");
		m1.setMphone(234567);
		m1.setMemail("tiyasa@gmail.com");
//		m1.setMAadhaar(1234576890);
		m1.setMcity("Sonarpur");
		m1.setMsalary(20000);
		Mockito.when(mrepo.save(m1)).thenReturn(m1);
		assertThat(ms.saveManage(m1)).isEqualTo(m1);
		
		
		Management m2 = new Management();
		m2.setMid(102);
		m2.setMname("Bidisha");
m2.setMgender("female");
m2.setMphone(456789);
		m2.setMemail("bidisha@gmail.com");
	//	m2.setMAadhaar(234567812);	m2.setMcity("Medinipur");
	m2.setMsalary(40000);
		Mockito.when(mrepo.save(m2)).thenReturn(m2);
		assertThat(ms.saveManage(m2)).isEqualTo(m2);
	
		
		List<Management> al = new ArrayList<>();
      al.add(m);
		al.add(m1);
	al.add(m2);
	}}
//	
//	
//	//testing updateDepartmrnt of department service
////	@Test
////	public void testUpdateDepartment() {
////		
////		Management d2 = new Management();
////		
////		d2.setDid(204);
////		d2.setDname("finance");
////		d2.setManager("jhon");
////		d2.setDphone(9856755);
////		d2.setDcity("pune");
////		
////		Optional<Management> da = Optional.of(d2);
////		Management ua = da.get();
////		
////		Mockito.when(drepo.findById(204)).thenReturn(da);
////		assertThat(ds.updateDeptById(ua, 204)).isEqualTo(ua);
////		
////	}
//	
//
//	
//}

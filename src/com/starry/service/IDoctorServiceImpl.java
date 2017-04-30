package com.starry.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.starry.dao.IDoctorDao;
import com.starry.entity.Doctor;
import com.starry.entity.DoctorInfo;

@Service("doctorService")
public class IDoctorServiceImpl implements IDoctorService {
	private IDoctorDao doctorDao;
	
	public IDoctorDao getDoctorDao() {
		return doctorDao;
	}
	 @Resource
	public void setDoctorDao(IDoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}
	@Override
	public List<DoctorInfo> selectAll(int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		System.out.println("IDoctorService"+doctorDao.selectAll(pageNum,pageSize));
		return doctorDao.selectAll(pageNum,pageSize);
	}



	@Override
	public int deleteById(String number) {
		// TODO Auto-generated method stub
		return doctorDao.deleteById(number);
	}

	@Override
	public int insert(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorDao.insert(doctor);
	}

	@Override
	public int update(Doctor doctor) {
		return doctorDao.update(doctor);
	}
	@Override
	public List<Doctor> getById(String dNumber) {
		// TODO Auto-generated method stub
		return doctorDao.getById(dNumber);
	}
	@Override
	public List<DoctorInfo> findName(String info,int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		return doctorDao.findName(info, pageNum, pageSize);
	}
	@Override
	public List<DoctorInfo> findId(String info,int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		return doctorDao.findId(info,pageNum,pageSize);
	}
	@Override
	public List<DoctorInfo> findDepartName(String info,int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		return doctorDao.findDepartName(info,pageNum,pageSize);
	}

}

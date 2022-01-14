package com.example.sample2;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.entity.Sample;

@Repository
public interface Sample2Mapper {

	List<Sample> selectSampleList();
	
	int exists(String id);
	
	int insertSample(Sample sample);
	
	int deleteSample(String id);
}

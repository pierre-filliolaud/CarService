package com.example.carrental.service;

import com.example.carrental.model.Sample;
import com.example.carrental.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    public Sample save(Sample sample) {
        return sampleRepository.save(sample);
    }

    public Optional<Sample> getOne(Long id) {
        return sampleRepository.findById(id);
    }
}

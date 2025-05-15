package com.example.demo.services;

import com.example.demo.Entity.Adresse;
import com.example.demo.Repository.AdresseInterface;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BusAdresseService {
    private AdresseInterface repo;
    public BusAdresseService(AdresseInterface repo) {
        this.repo=repo;
    }
List<Integer > list= Arrays.asList(1,5,4,8,7,8,7);
List<Integer> ll=list.stream().filter(nbr -> nbr>2).collect(Collectors.toList());
        public Optional<Adresse> FindById(Integer id) {
        return this.repo.findById(id);
    }
}


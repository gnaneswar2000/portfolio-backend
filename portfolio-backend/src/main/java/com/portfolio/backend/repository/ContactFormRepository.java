package com.portfolio.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.backend.entity.ContactForm;

public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {
}


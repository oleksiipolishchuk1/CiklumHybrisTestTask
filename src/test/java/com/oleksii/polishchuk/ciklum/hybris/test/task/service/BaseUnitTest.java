package com.oleksii.polishchuk.ciklum.hybris.test.task.service;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class BaseUnitTest {

    @BeforeEach
    void init(){
        MockitoAnnotations.initMocks(this);
    }

}

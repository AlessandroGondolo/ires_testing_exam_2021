package it.euris.ires.util;

import it.euris.ires.business.PaySessionBusiness;
import it.euris.ires.dataObject.*;
import it.euris.ires.entity.PaySession;
import it.euris.ires.exception.PaySessionException;
import it.euris.ires.service.IPaymentSessionService;
import it.euris.ires.service.impl.PaymentSessionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.registerCustomDateFormat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class PaySessionBusinessTest {

    @Mock
    PaymentSessionService paymentSessionService;

    PaySessionBusiness paySessionBusiness;



    @Test
    void createTestWhenCreateSessionRequestReturnsCorrectResponse() {
        PaySession paySession = new PaySession();
        CreatePaySessionRequest createPaySessionRequest = new CreatePaySessionRequest();
        CreatePaySessionResponse expectedResult = new CreatePaySessionResponse();

        paySession.setStatus(PaySessionStatus.CREATED);
        paySessionBusiness = new PaySessionBusiness(paymentSessionService);
        CreatePaySessionResponse response = paySessionBusiness.createPaySession((createPaySessionRequest));
        assertEquals(expectedResult, response);



    }


}

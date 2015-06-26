package de.bischinger.validation.boundary;

import de.bischinger.validation.business.StrategyRegistry;
import de.bischinger.validation.business.strategy.Strategy;
import de.bischinger.validation.model.CompoundKey;
import de.bischinger.validation.model.ValidationRequest;
import de.bischinger.validation.model.ValidationResult;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.Optional;

import static java.util.Optional.of;

/**
 * Created by Alexander Bischof on 25.06.15.
 */
@Path("/")
@Produces("application/xml")
@Consumes("application/xml")
public class ValidationResource {

    @Inject StrategyRegistry strategyRegistry;

    @GET
    @Produces("text/plain")
    public String list(){
       return strategyRegistry.entrySet().stream().map(e -> e.getKey()+":"+e.getValue()).reduce((t, u) -> t + "," + u).get();
    }

    @POST
    public ValidationResult validate(ValidationRequest validationRequest) {
        CompoundKey compoundKey = validationRequest.getCompoundKey();
        Strategy strategy = of(strategyRegistry.get(compoundKey)).get();
        return strategy.validate(validationRequest.getActual(), validationRequest.getExpected(), null);
    }
}

package org.jboss.aerogear.security.spi;

import org.jboss.aerogear.controller.router.Route;
import org.jboss.aerogear.controller.spi.SecurityProvider;
import org.jboss.aerogear.security.exception.ExceptionMessage;
import org.jboss.aerogear.security.idm.AeroGearPrincipal;

import javax.inject.Inject;
import javax.servlet.ServletException;

public class AeroGearSecurityProvider implements SecurityProvider {

    @Inject
    private AeroGearPrincipal principal;

    @Override
    public void isRouteAllowed(Route route) throws ServletException {

        if (!principal.hasRoles(route.getRoles())) {
            ExceptionMessage.AUTHENTICATION_FAILED.throwException();
        }
    }
}

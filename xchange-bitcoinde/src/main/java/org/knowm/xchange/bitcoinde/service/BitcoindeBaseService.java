package org.knowm.xchange.bitcoinde.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.bitcoinde.Bitcoinde;
import org.knowm.xchange.service.BaseExchangeService;
import org.knowm.xchange.service.BaseService;

import si.mazi.rescu.RestProxyFactory;

public class BitcoindeBaseService extends BaseExchangeService implements BaseService {

  protected final Bitcoinde bitcoinde;

  /**
   * Constructor
   */
  protected BitcoindeBaseService(Exchange exchange) {

    super(exchange);
    this.bitcoinde = RestProxyFactory.createProxy(Bitcoinde.class, exchange.getExchangeSpecification().getSslUri());
  }
}

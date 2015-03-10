package com.google.common.net;


/**
 * {@link InetAddresses} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractInetAddressesAssert} instead.
 */
public class InetAddressesAssert extends AbstractInetAddressesAssert<InetAddressesAssert, InetAddresses> {

  /**
   * Creates a new <code>{@link InetAddressesAssert}</code> to make assertions on actual InetAddresses.
   * @param actual the InetAddresses we want to make assertions on.
   */
  public InetAddressesAssert(InetAddresses actual) {
    super(actual, InetAddressesAssert.class);
  }

  /**
   * An entry point for InetAddressesAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myInetAddresses)</code> and get specific assertion with code completion.
   * @param actual the InetAddresses we want to make assertions on.
   * @return a new <code>{@link InetAddressesAssert}</code>
   */
  public static InetAddressesAssert assertThat(InetAddresses actual) {
    return new InetAddressesAssert(actual);
  }
}
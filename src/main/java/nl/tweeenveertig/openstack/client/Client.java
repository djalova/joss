package nl.tweeenveertig.openstack.client;

/**
 * The authenticate call creates a new Account object, which allows you to interact with the Object Store.
 * Note that security tokens last for a maximum of 24 hours, after which a new one must be fetched.
 * <ul>
 *     <li>Instantiate ClientImpl for the real client to the Object Store.</li>
 *     <li>Instantiate ClientMock for the client with mocked access, simulated by holding objects in-memory</li>
 * </ul>
 * Call {@link #authenticate(String, String, String) authenticate} to get an {@link Account} which allows you to
 * start operating on the Object Store.
 * @author Robert Bor
 */
public interface Client {

    /**
    * Calls the identity module of the OpenStack implementation to authenticate itself against. If
    * successful, it returns the internal URL to work with and the authentication token, which will
    * automatically be added to all calls made by the client henceforth.
    * @param username username of the account
    * @param password password of the account
    * @param authUrl URL to call the authenticate against, supplied by your OpenStack implementation vendor
    */
    public Account authenticate(String username, String password, String authUrl);

}
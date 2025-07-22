package it.carmelolagamba.sbam.integration.http;

import java.util.Map;

/**
 * This interface defines the contract for an HTTP client that can perform various types of HTTP requests.
 * It provides methods for GET, POST, PUT, DELETE, and PATCH requests, allowing for flexible interaction with web services.
 *
 * @Since 2.1
 * @Author carmelolg
 */
public interface IHttpClient {

    /**
     * Performs a GET request to the specified URI with the given query parameters and returns the response as an object of the specified type.
     * @param uri the URI to send the GET request to
     * @param queryParams the query parameters to include in the request
     * @param responseType the class type of the response object
     * @return the response object of the specified type
     * @param <T> the type of the response object
     */
    <T> T get(String uri, Map<String, ?> queryParams, Class<T> responseType);

    /**
     * Performs a POST request to the specified URI with the given body and query parameters, and returns the response as an object of the specified type.
     * @param uri the URI to send the POST request to
     * @param body the body of the request
     * @param queryParams the query parameters to include in the request
     * @param responseType the class type of the response object
     * @return the response object of the specified type
     * @param <T> the type of the request body
     * @param <R> the type of the response object
     */
    <T, R> R post(String uri, T body, Map<String, ?> queryParams, Class<R> responseType);

    /**
     * Performs a PUT request to the specified URI with the given body and query parameters, and returns the response as an object of the specified type.
     * @param uri the URI to send the PUT request to
     * @param body the body of the request
     * @param queryParams the query parameters to include in the request
     * @param responseType the class type of the response object
     * @return the response object of the specified type
     * @param <T> the type of the request body
     * @param <R> the type of the response object
     */
    <T, R> R put(String uri, T body, Map<String, ?> queryParams, Class<R> responseType);

    /**
     * Performs a DELETE request to the specified URI with the given query parameters.
     * @param uri the URI to send the DELETE request to
     * @param queryParams the query parameters to include in the request
     */
    void delete(String uri, Map<String, ?> queryParams);

    /**
     * Performs a PATCH request to the specified URI with the given body and query parameters, and returns the response as an object of the specified type.
     * @param uri the URI to send the PATCH request to
     * @param body the body of the request
     * @param queryParams the query parameters to include in the request
     * @param responseType the class type of the response object
     * @return the response object of the specified type
     * @param <T> the type of the request body
     * @param <R> the type of the response object
     */
    <T, R> R patch(String uri, T body, Map<String, ?> queryParams, Class<R> responseType);

}

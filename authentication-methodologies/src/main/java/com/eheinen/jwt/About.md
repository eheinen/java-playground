#JWT - JSON Web Token
JWT is basically stateless since it doesn't store any information about the authentication in the server.
The entity which want to pass through the authentication with JWT, must send an encoded token and this token will be 
decoded to get access to the JSON Object data in order to use it to complete the authentication.

JWT has 3 parts: Header, Body and Signature.  
- The header contains information about how the token is encoded.
- The body contains the essential information encoded.
- The signature provides the security. 

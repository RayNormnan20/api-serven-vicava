
package api.serven.vicava.Controller;



// Define un registro (record) llamado AuthResponseDto.
// Este record representa la respuesta que se envía al cliente después de un intento de autenticación o registro.
public record AuthResponseDto(
    String token,        // Contiene el token JWT generado si la autenticación o el registro fueron exitosos.
    AuthStatus authStatus ,// Representa el estado de la operación de autenticación o registro.
        String message
) {
   
}
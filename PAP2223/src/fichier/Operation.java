package fichier;

import java.time.LocalDate;

public record Operation(String qui,String quoi,LocalDate date,Double montant) {
}

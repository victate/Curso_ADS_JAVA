import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

List<Motorista> motoristas = getMotoristasDaEmpresa();
List<Motorista> habilitados = new ArrayList<>();

// Filtrando motoristas com CHN ativa
for(Motorista m : motoristas) {
    if(m.isChnAtiva()) {
        habilitados.add(m);
    }
}

//Ordenando por tempo de casa (anos) usando Comparator anônimo
Collections.sort(habilitados, new Comparator<Motorista>() {
    @Override
    public int compare(Motorista m1, Motorista m2) {
        return Integer.compare(m1.getAnosEmpresa(), m2.getAnosEmpresa());
    }
});
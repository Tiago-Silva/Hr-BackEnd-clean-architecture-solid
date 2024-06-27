package br.com.hrbackend.infrastructure.service;

import br.com.hrbackend.infrastructure.dto.EmpresaRequestDTO;
import br.com.hrbackend.infrastructure.dto.EmpresaResponseDTO;
import br.com.hrbackend.infrastructure.db.entityDB.EmpresaDB;
import br.com.hrbackend.infrastructure.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpressService {

    private final EmpresaRepository repository;
    public EmpressService(EmpresaRepository repository) {
        this.repository = repository;
    }

    public void createEmpress(EmpresaRequestDTO requestDTO) {

        if (
            requestDTO == null ||
            requestDTO.cnpj().isEmpty() ||
            requestDTO.razaoSocial().isEmpty() ||
            requestDTO.nomeFantasia().isEmpty()
        ) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.repository.save(new EmpresaDB(requestDTO));
    }

    public void updateEmpress(EmpresaResponseDTO responseDTO) {

        if (responseDTO == null || responseDTO.idempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.repository.update(responseDTO);
    }

    public void deleteEmpress(EmpresaResponseDTO responseDTO) {

        if (responseDTO == null || responseDTO.idempresa() <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.repository.delete(responseDTO);
    }

    public List<EmpresaResponseDTO> getAllEmpress() {
        List<EmpresaDB> allEmpress = this.repository.getAllEmpresas();
        return allEmpress.stream().map(this::convertToResponseDTO).toList();
    }

    public EmpresaResponseDTO getEmpressById(int id) {
        return this.convertToResponseDTO(this.repository.getEmpresaById(id));
    }

    public List<EmpresaResponseDTO> getEmpressController() {
        List<EmpresaDB> empress = this.repository.getEmpresasControllers();
        return empress.stream().map(this::convertToResponseDTO).toList();
    }

    public List<EmpresaResponseDTO> getEmpressFilial() {
        List<EmpresaDB> empress = this.repository.getFiliais();
        return empress.stream().map(this::convertToResponseDTO).toList();
    }

    private EmpresaResponseDTO convertToResponseDTO(EmpresaDB empresaDB) {
        return new EmpresaResponseDTO(
            empresaDB.getIdempresa(),
            empresaDB.getNomeFantasia(),
            empresaDB.getRazaoSocial(),
            empresaDB.getCnpj(),
            empresaDB.getInscricaoEstadual(),
            empresaDB.getBairro(),
            empresaDB.getCidade(),
            empresaDB.getEndereco(),
            empresaDB.getEstado(),
            empresaDB.getTelefone(),
            empresaDB.getLogoMarca(),
            empresaDB.isFilial(),
            empresaDB.getEmpresaController(),
            empresaDB.isMatriz(),
            empresaDB.getStatus()
        );
    }
}

package br.com.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="evento")
public class Evento implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cod;
	@Column
	private String nome;
	@Column
	private String data;
	@Column
	private String horario;
	@Column
	private String descricao;
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
	public Evento() {
	}

	public Evento(Long cod, String nome, String data, String horario, String descricao) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.data = data;
		this.horario = horario;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Evento [cod=" + cod + ", nome=" + nome + ", data=" + sdf.format(data) + ", horario=" + horario + ", descricao="
				+ descricao + "]";
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}

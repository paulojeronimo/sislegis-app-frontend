package br.org.mj.sislegis.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Proposicao implements Serializable
{

   private static final long serialVersionUID = 7949894944142814382L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", updatable = false, nullable = false)
   private Long id;
   @Version
   @Column(name = "version")
   private int version;

   @Column
   private Integer idProposicao;

   @Column
   private String ano;

   @Column
   private Integer numero;

   @Column
   @Temporal(TemporalType.DATE)
   private Date dataApresentacao;

   @Column
   private String ementa;

   @Column
   private String autor;

   @ManyToMany(mappedBy = "listaProposicao")
   private Set<Reuniao> listaReuniao = new HashSet<Reuniao>();

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (!(obj instanceof Proposicao))
      {
         return false;
      }
      Proposicao other = (Proposicao) obj;
      if (id != null)
      {
         if (!id.equals(other.id))
         {
            return false;
         }
      }
      return true;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }

   public Integer getIdProposicao()
   {
      return idProposicao;
   }

   public void setIdProposicao(Integer idProposicao)
   {
      this.idProposicao = idProposicao;
   }

   public String getAno()
   {
      return ano;
   }

   public void setAno(String ano)
   {
      this.ano = ano;
   }

   public Integer getNumero()
   {
      return numero;
   }

   public void setNumero(Integer numero)
   {
      this.numero = numero;
   }

   public Date getDataApresentacao()
   {
      return dataApresentacao;
   }

   public void setDataApresentacao(Date dataApresentacao)
   {
      this.dataApresentacao = dataApresentacao;
   }

   public String getEmenta()
   {
      return ementa;
   }

   public void setEmenta(String ementa)
   {
      this.ementa = ementa;
   }

   public String getAutor()
   {
      return autor;
   }

   public void setAutor(String autor)
   {
      this.autor = autor;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (id != null)
         result += "id: " + id;
      result += ", version: " + version;
      if (idProposicao != null)
         result += ", idProposicao: " + idProposicao;
      if (ano != null && !ano.trim().isEmpty())
         result += ", ano: " + ano;
      if (numero != null)
         result += ", numero: " + numero;
      if (dataApresentacao != null)
         result += ", dataApresentacao: " + dataApresentacao;
      if (ementa != null && !ementa.trim().isEmpty())
         result += ", ementa: " + ementa;
      if (autor != null && !autor.trim().isEmpty())
         result += ", autor: " + autor;
      return result;
   }

   public Set<Reuniao> getListaReuniao()
   {
      return listaReuniao;
   }

   public void setListaReuniao(Set<Reuniao> listaReuniao)
   {
      this.listaReuniao = listaReuniao;
   }

}
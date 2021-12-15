using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ProjetoPUC.Models
{
    public class PucDBContext : DbContext
    {
        public PucDBContext(DbContextOptions<PucDBContext> options) : base(options) 
        {

        }

        public DbSet<Produto> Produtos { get; set; }

        //protected override void OnModelCreating(ModelBuilder modelBuilder)
        //{
        //    modelBuilder.Entity<Empresa>(em =>
        //    {
        //        em.HasMany(em => em.Produtos)
        //        .WithOne(p => p.Empresa)
        //        .HasForeignKey(p => p.IdEmpresa)
        //        .HasConstraintName("EmpresaEstoqueFKConstraint");

        //        em.HasOne(em => em.Endereco)
        //        .WithOne(end => end.Empresa)
        //        .HasForeignKey<Endereco>(end => end.IdEmpresa)
        //        .HasConstraintName("EmpresaEnderecoFKConstraint");
        //    });
        //}
    }
}

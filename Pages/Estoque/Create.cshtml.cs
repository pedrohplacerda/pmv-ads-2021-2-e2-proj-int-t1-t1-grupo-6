using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.AspNetCore.Mvc.Rendering;
using ProjetoPUC.Models;

namespace ProjetoPUC.Pages.Estoque
{
    public class CreateModel : PageModel
    {
        private readonly ProjetoPUC.Models.PucDBContext _context;

        public CreateModel(ProjetoPUC.Models.PucDBContext context)
        {
            _context = context;
        }

        public IActionResult OnGet()
        {
        ViewData["IdEmpresa"] = new SelectList(_context.Empresas, "Id", "Nome");
            return Page();
        }

        [BindProperty]
        public ProjetoPUC.Models.Estoque Estoque { get; set; }

        // To protect from overposting attacks, see https://aka.ms/RazorPagesCRUD
        public async Task<IActionResult> OnPostAsync()
        {
            if (!ModelState.IsValid)
            {
                return Page();
            }

            _context.Estoque.Add(Estoque);
            await _context.SaveChangesAsync();

            return RedirectToPage("./Index");
        }
    }
}

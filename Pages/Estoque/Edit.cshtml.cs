using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using ProjetoPUC.Models;

namespace ProjetoPUC.Pages.Estoque
{
    public class EditModel : PageModel
    {
        private readonly ProjetoPUC.Models.PucDBContext _context;

        public EditModel(ProjetoPUC.Models.PucDBContext context)
        {
            _context = context;
        }

        [BindProperty]
        public ProjetoPUC.Models.Estoque Estoque { get; set; }

        public async Task<IActionResult> OnGetAsync(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            Estoque = await _context.Estoque
                .Include(e => e.Empresa).FirstOrDefaultAsync(m => m.Id == id);

            if (Estoque == null)
            {
                return NotFound();
            }
           ViewData["IdEmpresa"] = new SelectList(_context.Empresas, "Id", "Id");
            return Page();
        }

        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see https://aka.ms/RazorPagesCRUD.
        public async Task<IActionResult> OnPostAsync()
        {
            if (!ModelState.IsValid)
            {
                return Page();
            }

            _context.Attach(Estoque).State = EntityState.Modified;

            try
            {
                await _context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!EstoqueExists(Estoque.Id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return RedirectToPage("./Index");
        }

        private bool EstoqueExists(int id)
        {
            return _context.Estoque.Any(e => e.Id == id);
        }
    }
}

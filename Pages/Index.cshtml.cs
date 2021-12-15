using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Logging;
using Newtonsoft.Json;
using ProjetoPUC.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ProjetoPUC.Pages
{
    public class IndexModel : PageModel
    {
        private readonly ILogger<IndexModel> _logger;
        private readonly PucDBContext _context;

        public IndexModel(ILogger<IndexModel> logger, PucDBContext context)
        {
            _logger = logger;
            _context = context;
        }
        [BindProperty]
        public IList<Produto> Produtos { get; set; }

        public void OnGet()
        {
            Produtos = _context.Produtos.ToList();

        }
    }
}

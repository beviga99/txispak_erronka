using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BezeroakDLL
{
    public partial class Kontrola : UserControl
    {

        public Kontrola()
        {
            InitializeComponent();
        }

        private void Kontrola_Load(object sender, EventArgs e)
        {

            this.bezeroakTableAdapter.FillBy(this.txispakDataSet.Bezeroak);

            chart1.DataSource = this.txispakDataSet.Bezeroak.GroupBy(b => b.Client_Name).ToDictionary(g => g.Key, g => g.Count());

            chart1.Series[0].YValueMembers = "Value";
            chart1.Series[0].XValueMember = "Key";
            chart1.DataBind();
        }
    }
}

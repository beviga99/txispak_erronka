
namespace TxispakGrafikoak
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.gp_1 = new System.Windows.Forms.GroupBox();
            this.button2 = new System.Windows.Forms.Button();
            this.gp_2 = new System.Windows.Forms.GroupBox();
            this.bot_produktuak = new System.Windows.Forms.Button();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.bot_salmentak = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.txispakDataSet = new TxispakGrafikoak.TxispakDataSet();
            this.bezeroakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.bezeroakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.BezeroakTableAdapter();
            this.produktuakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.produktuakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.ProduktuakTableAdapter();
            this.salmentakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.salmentakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.SalmentakTableAdapter();
            this.label1 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.gp_1.SuspendLayout();
            this.gp_2.SuspendLayout();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // gp_1
            // 
            this.gp_1.Controls.Add(this.button2);
            this.gp_1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gp_1.ForeColor = System.Drawing.Color.White;
            this.gp_1.Location = new System.Drawing.Point(82, 246);
            this.gp_1.Name = "gp_1";
            this.gp_1.Size = new System.Drawing.Size(200, 100);
            this.gp_1.TabIndex = 4;
            this.gp_1.TabStop = false;
            this.gp_1.Text = "BEZEROAK";
            // 
            // button2
            // 
            this.button2.Image = global::TxispakGrafikoak.Properties.Resources.Captura_de_pantalla_2021_11_09_114037;
            this.button2.Location = new System.Drawing.Point(67, 28);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(61, 50);
            this.button2.TabIndex = 2;
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // gp_2
            // 
            this.gp_2.Controls.Add(this.bot_produktuak);
            this.gp_2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gp_2.ForeColor = System.Drawing.Color.White;
            this.gp_2.Location = new System.Drawing.Point(425, 246);
            this.gp_2.Name = "gp_2";
            this.gp_2.Size = new System.Drawing.Size(200, 100);
            this.gp_2.TabIndex = 5;
            this.gp_2.TabStop = false;
            this.gp_2.Text = "PRODUKTUAK";
            // 
            // bot_produktuak
            // 
            this.bot_produktuak.Image = global::TxispakGrafikoak.Properties.Resources.Captura_de_pantalla_2021_11_09_114135;
            this.bot_produktuak.Location = new System.Drawing.Point(70, 29);
            this.bot_produktuak.Name = "bot_produktuak";
            this.bot_produktuak.Size = new System.Drawing.Size(60, 51);
            this.bot_produktuak.TabIndex = 2;
            this.bot_produktuak.UseVisualStyleBackColor = true;
            this.bot_produktuak.Click += new System.EventHandler(this.bot_produktuak_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.bot_salmentak);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.ForeColor = System.Drawing.Color.White;
            this.groupBox1.Location = new System.Drawing.Point(756, 246);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(200, 100);
            this.groupBox1.TabIndex = 6;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "SALMENTAK";
            // 
            // bot_salmentak
            // 
            this.bot_salmentak.Image = global::TxispakGrafikoak.Properties.Resources.Captura_de_pantalla_2021_11_09_114151;
            this.bot_salmentak.Location = new System.Drawing.Point(73, 31);
            this.bot_salmentak.Name = "bot_salmentak";
            this.bot_salmentak.Size = new System.Drawing.Size(60, 49);
            this.bot_salmentak.TabIndex = 2;
            this.bot_salmentak.UseVisualStyleBackColor = true;
            this.bot_salmentak.Click += new System.EventHandler(this.bot_salmentak_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(108, 50);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(0, 20);
            this.label3.TabIndex = 1;
            // 
            // txispakDataSet
            // 
            this.txispakDataSet.DataSetName = "TxispakDataSet";
            this.txispakDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // bezeroakBindingSource
            // 
            this.bezeroakBindingSource.DataMember = "Bezeroak";
            this.bezeroakBindingSource.DataSource = this.txispakDataSet;
            // 
            // bezeroakTableAdapter
            // 
            this.bezeroakTableAdapter.ClearBeforeFill = true;
            // 
            // produktuakBindingSource
            // 
            this.produktuakBindingSource.DataMember = "Produktuak";
            this.produktuakBindingSource.DataSource = this.txispakDataSet;
            // 
            // produktuakTableAdapter
            // 
            this.produktuakTableAdapter.ClearBeforeFill = true;
            // 
            // salmentakBindingSource
            // 
            this.salmentakBindingSource.DataMember = "Salmentak";
            this.salmentakBindingSource.DataSource = this.txispakDataSet;
            // 
            // salmentakTableAdapter
            // 
            this.salmentakTableAdapter.ClearBeforeFill = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 72F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(294, 69);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(451, 108);
            this.label1.TabIndex = 8;
            this.label1.Text = "TXISPAK";
            // 
            // button1
            // 
            this.button1.Image = global::TxispakGrafikoak.Properties.Resources.close;
            this.button1.Location = new System.Drawing.Point(996, 12);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(32, 32);
            this.button1.TabIndex = 7;
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            this.ClientSize = new System.Drawing.Size(1040, 546);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.gp_2);
            this.Controls.Add(this.gp_1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.gp_1.ResumeLayout(false);
            this.gp_2.ResumeLayout(false);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private TxispakDataSet txispakDataSet;
        private System.Windows.Forms.BindingSource bezeroakBindingSource;
        private TxispakDataSetTableAdapters.BezeroakTableAdapter bezeroakTableAdapter;
        private System.Windows.Forms.BindingSource produktuakBindingSource;
        private TxispakDataSetTableAdapters.ProduktuakTableAdapter produktuakTableAdapter;
        private System.Windows.Forms.BindingSource salmentakBindingSource;
        private TxispakDataSetTableAdapters.SalmentakTableAdapter salmentakTableAdapter;
        private System.Windows.Forms.GroupBox gp_1;
        private System.Windows.Forms.GroupBox gp_2;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button bot_produktuak;
        private System.Windows.Forms.Button bot_salmentak;
        private System.Windows.Forms.Label label1;
    }
}



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
            this.kontrola1 = new BezeroakDLL.Kontrola();
            this.kontrola2 = new ProduktuaDLL.Kontrola();
            this.gp_1 = new System.Windows.Forms.GroupBox();
            this.label1 = new System.Windows.Forms.Label();
            this.gp_2 = new System.Windows.Forms.GroupBox();
            this.label2 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txispakDataSet = new TxispakGrafikoak.TxispakDataSet();
            this.bezeroakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.bezeroakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.BezeroakTableAdapter();
            this.produktuakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.produktuakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.ProduktuakTableAdapter();
            this.salmentakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.salmentakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.SalmentakTableAdapter();
            this.button1 = new System.Windows.Forms.Button();
            this.pictureBox3 = new System.Windows.Forms.PictureBox();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.gp_1.SuspendLayout();
            this.gp_2.SuspendLayout();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // kontrola1
            // 
            this.kontrola1.Location = new System.Drawing.Point(28, 278);
            this.kontrola1.Name = "kontrola1";
            this.kontrola1.Size = new System.Drawing.Size(401, 252);
            this.kontrola1.TabIndex = 0;
            // 
            // kontrola2
            // 
            this.kontrola2.Location = new System.Drawing.Point(575, 278);
            this.kontrola2.Name = "kontrola2";
            this.kontrola2.Size = new System.Drawing.Size(400, 239);
            this.kontrola2.TabIndex = 1;
            // 
            // gp_1
            // 
            this.gp_1.Controls.Add(this.label1);
            this.gp_1.Controls.Add(this.pictureBox1);
            this.gp_1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gp_1.ForeColor = System.Drawing.Color.White;
            this.gp_1.Location = new System.Drawing.Point(63, 62);
            this.gp_1.Name = "gp_1";
            this.gp_1.Size = new System.Drawing.Size(200, 100);
            this.gp_1.TabIndex = 4;
            this.gp_1.TabStop = false;
            this.gp_1.Text = "BEZEROAK GUZTIRA";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(108, 50);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(0, 20);
            this.label1.TabIndex = 1;
            // 
            // gp_2
            // 
            this.gp_2.Controls.Add(this.label2);
            this.gp_2.Controls.Add(this.pictureBox2);
            this.gp_2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gp_2.ForeColor = System.Drawing.Color.White;
            this.gp_2.Location = new System.Drawing.Point(403, 62);
            this.gp_2.Name = "gp_2";
            this.gp_2.Size = new System.Drawing.Size(200, 100);
            this.gp_2.TabIndex = 5;
            this.gp_2.TabStop = false;
            this.gp_2.Text = "PRODUKTUAK GUZTIRA";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(108, 50);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(0, 16);
            this.label2.TabIndex = 1;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.pictureBox3);
            this.groupBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.ForeColor = System.Drawing.Color.White;
            this.groupBox1.Location = new System.Drawing.Point(728, 62);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(200, 100);
            this.groupBox1.TabIndex = 6;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "IRABAZIAK";
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
            // pictureBox3
            // 
            this.pictureBox3.Image = global::TxispakGrafikoak.Properties.Resources.sale;
            this.pictureBox3.Location = new System.Drawing.Point(24, 34);
            this.pictureBox3.Name = "pictureBox3";
            this.pictureBox3.Size = new System.Drawing.Size(60, 45);
            this.pictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox3.TabIndex = 0;
            this.pictureBox3.TabStop = false;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = global::TxispakGrafikoak.Properties.Resources._81960;
            this.pictureBox2.Location = new System.Drawing.Point(24, 34);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(60, 45);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 0;
            this.pictureBox2.TabStop = false;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::TxispakGrafikoak.Properties.Resources._526_5261793_people_icon_people_icon_white;
            this.pictureBox1.Location = new System.Drawing.Point(24, 34);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(60, 45);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            this.ClientSize = new System.Drawing.Size(1040, 574);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.gp_2);
            this.Controls.Add(this.gp_1);
            this.Controls.Add(this.kontrola2);
            this.Controls.Add(this.kontrola1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.gp_1.ResumeLayout(false);
            this.gp_1.PerformLayout();
            this.gp_2.ResumeLayout(false);
            this.gp_2.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private BezeroakDLL.Kontrola kontrola1;
        private ProduktuaDLL.Kontrola kontrola2;
        private TxispakDataSet txispakDataSet;
        private System.Windows.Forms.BindingSource bezeroakBindingSource;
        private TxispakDataSetTableAdapters.BezeroakTableAdapter bezeroakTableAdapter;
        private System.Windows.Forms.BindingSource produktuakBindingSource;
        private TxispakDataSetTableAdapters.ProduktuakTableAdapter produktuakTableAdapter;
        private System.Windows.Forms.BindingSource salmentakBindingSource;
        private TxispakDataSetTableAdapters.SalmentakTableAdapter salmentakTableAdapter;
        private System.Windows.Forms.GroupBox gp_1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.GroupBox gp_2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.PictureBox pictureBox3;
        private System.Windows.Forms.Button button1;
    }
}


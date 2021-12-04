//
//  ProcedimentosViewController.swift
//  projetoFaculdade
//
//  Created by Clarisse Furquim on 13/10/21.
//

import UIKit

class ProcedimentosViewController: UIViewController {

    @IBOutlet weak var massagemModeladoraButton: UIButton!
    @IBOutlet weak var massagemRelaxanteButton: UIButton!
    @IBOutlet weak var drenagemLinfaticaButton: UIButton!
    @IBOutlet weak var LimpezadePeleButton: UIButton!
    @IBOutlet weak var MicroagulhamentoButton: UIButton!
    @IBOutlet weak var depilacaoButton: UIButton!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        setupUI()
    }
    
    private func setupUI() {
        massagemModeladoraButton.layer.cornerRadius = 10
        massagemRelaxanteButton.layer.cornerRadius = 10
        drenagemLinfaticaButton.layer.cornerRadius = 10
        LimpezadePeleButton.layer.cornerRadius = 10
        MicroagulhamentoButton.layer.cornerRadius = 10
        depilacaoButton.layer.cornerRadius = 10
    
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}

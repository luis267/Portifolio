import subprocess
from pathlib import Path

pasta = Path(".")
# Convertemos em lista para poder contar quantos arquivos existem
arquivos = list(pasta.glob("*.m4a"))
total = len(arquivos)

pasta_mp3 = pasta / "convertidos"
pasta_mp3.mkdir(exist_ok=True)

# enumerate nos dá o índice (começando em 1) e o arquivo
for indice, ficheiro in enumerate(arquivos, 1):
    caminho_novo = pasta_mp3 / ficheiro.with_suffix(".mp3").name
    
    # Criamos o comando (usando str() para garantir compatibilidade)
    comando = ["ffmpeg", "-i", str(ficheiro), str(caminho_novo)]
    
    print(f"[{indice}/{total}] A converter: {ficheiro.name}...")
    
    # Silenciamos o FFmpeg enviando a saída para o DEVNULL
    resultado = subprocess.run(comando, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
    
    # Se o código de retorno for 0, o FFmpeg concluiu com sucesso
    if resultado.returncode == 0:
        print("  -> Sucesso! Removendo original...")
        ficheiro.unlink() # Deleta o arquivo m4a original
    else:
        print("  -> Ocorreu um erro na conversão.")

print("\nProcesso finalizado!")
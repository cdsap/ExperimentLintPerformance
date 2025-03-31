package com.performance.module_2_215

class Feature215UseCase0(
    private val repository: Feature215Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

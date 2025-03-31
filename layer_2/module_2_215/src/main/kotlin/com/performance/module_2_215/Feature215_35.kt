package com.performance.module_2_215

class Feature215UseCase1(
    private val repository: Feature215Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}

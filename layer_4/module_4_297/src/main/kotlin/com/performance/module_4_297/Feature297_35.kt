package com.performance.module_4_297

class Feature297UseCase1(
    private val repository: Feature297Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
